git 설정 관련

- username, password 저장 명령어 (아래 명령어 이후 최초 로그인하면 계정 정보 저장)
- git config --global credential.helper store

- git push 시 계속 github login 팝업 표시되는 현상
- git remote set-url origin git@github.com:username/repo.git
- branch tracking 정보 확인
- git branch -vv
