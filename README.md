# 👨🏾‍🤝‍👨🏽Mentoring System
개발자 멘토와 멘티를 1:1로 연결해주는 멘토링 서비스를 제공하는 API
# 🛠Tech Stack
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> 
<img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white">
<img src="https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white">
<img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white">
<img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
<img src="https://img.shields.io/badge/redis-DC382D?style=for-the-badge&logo=redis&logoColor=white">
<img src="https://img.shields.io/badge/hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white">

# 🔨프로젝트 기능 및 설계
## 🤷‍♂️회원
* **회원가입**
  * 회원은 **멘토**, **멘티**로 구분되어 가입을 진행합니다.
  * 이메일, 이름, 비밀번호, 닉네임, 직무(프론트, 백엔드, AI), 소속(회사) 등을 입력하여 회원가입
* **로그인**, **로그아웃**
  * 로그인 시에는 아이디와 패스워드가 일치해야 합니다.
  * 로그인이 완료된 후에 JSON Web Token이 발급됩니다.
* **회원정보 수정**
  * 수정이 가능한 회원정보 항목으로는 (패스워드, 닉네임, 역할, 직무)가 있습니다.
* **회원 탈퇴**
## 👨🏿‍🤝‍👨🏿멘토링
* **멘토링 등록**
  * 멘토링 등록은 멘토만 할 수 있습니다.
* **멘토링 조회**
  * 멘토링에 대한 필터는 멘토 직무별 또는 멘토 평점으로 가능합니다.
  * 멘토링 검색은 멘토 닉네임 또는 이름으로 가능합니다.
* **멘토링 수정**
* **멘토링 삭제**
## ☝예약
* 예약 단위는 1시간 단위로 진행
* 멘토는 멘티 예약에 대한 승인 여부를 결정할 수 있다.
## 🎈1:1채팅
* 기본적으로 멘토와 멘티의 1:1 채팅을 원칙으로 합니다.
  
# 🗺ERD
![ERD](https://github.com/kimsungho93/mentoring/assets/87847853/ff64ca17-f038-4af0-98d4-bda519a2ab82)


# 🤔Trouble Shooting
