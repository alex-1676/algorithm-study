import subprocess
import re

# 전체 커밋 메시지 가져오기
result = subprocess.run(
    ["git", "log", "--oneline"],
    capture_output=True,
    text=True
)

lines = result.stdout.strip().split("\n")

# AUTO 커밋 제외하고 플랫폼별로 카운트
boj = sum(1 for l in lines if "[BOJ]" in l and "[AUTO]" not in l)
pgs = sum(1 for l in lines if "[PGS]" in l and "[AUTO]" not in l)
inf = sum(1 for l in lines if "[INF]" in l and "[AUTO]" not in l)
total = boj + pgs + inf

# README 읽기
with open("README.md", "r", encoding="utf-8") as f:
    content = f.read()

# 각 플랫폼 숫자 교체
content = re.sub(r"(백준 \| )\*\*\d+\*\*", f"백준 | **{boj}**", content)
content = re.sub(r"(프로그래머스 \| )\*\*\d+\*\*", f"프로그래머스 | **{pgs}**", content)
content = re.sub(r"(인프런 \| )\*\*\d+\*\*", f"인프런 | **{inf}**", content)
content = re.sub(r"(\*\*합계\*\* \| )\*\*\d+\*\*", f"**합계** | **{total}**", content)

# README 저장
with open("README.md", "w", encoding="utf-8") as f:
    f.write(content)

print(f"백준: {boj} / 프로그래머스: {pgs} / 인프런: {inf} / 합계: {total}")