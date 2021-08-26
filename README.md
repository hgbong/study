
 
- 2021/08/13 부로 github API, CLI 사용 시 username/password 방식을 못쓴다고 함
- 이에 따른 최초 git 설정은 다음과 같음

1. 토큰 발급 (https://docs.github.com/en/github/authenticating-to-github/keeping-your-account-and-data-secure/creating-a-personal-access-token)
   
1. git clone 후 최초 push 전에 아래 명령어 실행 (최초 인증만 하면 해당 인증정보를 계속 사용한다는 명령어)
   
   <code>
    git config credential.helper store
   </code>
   
1. git push 수행  
   이때 github UI에서 로그인하면 CLI에서 username, password 를 입력하는데 username은 동일하게, password는 위의 Token을 붙여넣음) 
   
   <code>git push -u origin {branchName}</code>        
   <code>username: {username}</code>
   <code>password: {token값 입력}</code>
   
1. 정상적으로 push