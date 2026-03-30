import subprocess
import re

result = subprocess.run(
    ["git", "log", "--oneline"],
    capture_output=True,
    text=True
)

lines = result.stdout.strip().split("\n")

# [AUTO] 커밋 제외
lines = [l for l in lines if "[AUTO]" not in l]

# 플랫폼별 카운트
boj = sum(1 for l in lines if "[BOJ]" in l)
pgs = sum(1 for l in lines if "[PGS]" in l)

# [INF] 태그가 있거나, 숫자로 시작하는 커밋은 인프런으로 카운트
# git log --oneline 형식: "커밋해시 메시지" 이므로
# 메시지 부분만 추출해서 확인
inf = sum(1 for l in lines if "[INF]" in l or re.search(r'\d+\.', l.split(' ', 1)[-1]))

total = boj + pgs + inf

# README 읽기
with open("README.md", "r", encoding="utf-8") as f:
    content = f.read()

# 숫자 교체
content = re.sub(r"(백준 \| )\*\*\d+\*\*", f"백준 | **{boj}**", content)
content = re.sub(r"(프로그래머스 \| )\*\*\d+\*\*", f"프로그래머스 | **{pgs}**", content)
content = re.sub(r"(인프런 \| )\*\*\d+\*\*", f"인프런 | **{inf}**", content)
content = re.sub(r"(\*\*합계\*\* \| )\*\*\d+\*\*", f"**합계** | **{total}**", content)

# README 저장
with open("README.md", "w", encoding="utf-8") as f:
    f.write(content)

print(f"백준: {boj} / 프로그래머스: {pgs} / 인프런: {inf} / 합계: {total}")