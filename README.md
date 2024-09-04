<h1>프로젝트 소개</h1>
<span>
    새로운 제품이 아닌 중고제품을 합리적인 가격으로<br>
    구매하고 판매하고자 하는 사용자들을 위한 중고거래 웹페이지
</span>
<h3>개발 기간 및 인원</h3>
<span>
    24.07.15 ~ 24.07.26(2주)
    백엔드 1명
</span><br>

<h1>ERD 구조</h1><br>
<a href="https://www.erdcloud.com/d/iDW96RErGjWhGEMSb">ERD Cloud에서 직접 보기</a><br>
<img src="https://github.com/user-attachments/assets/ab3245bb-5fb2-4bc5-9079-daff5d19ef16"/>

<h1>기술 스택</h1>
<br>
<img src="https://skillicons.dev/icons?i=html,css,javascript,java,spring,mysql,theme=light">
<br>

<h1>주요기능</h1><br>
    <h3>요약</h3>
    <table>
        <thead>
            <tr>
                <th><b>공통</b></th>
                <th><b>사용자</b></th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>
                    - 회원가입, 로그인 <br>
                    - 중고 거래 물품 게시글 확인 가능 <br>
                    - 원하는 물품 게시글 검색 가능
                </td>
                <td>
                    - 구입하고 싶은 물품 게시글 열람 가능 <br>
                    - 판매하고 싶은 물품 게시글 등록 가능 <br>
                    - 구입하려는 물품을 판매하는 판매자와 채팅 가능
                </td>
            </tr>
        </tbody>
    </table><br>
<h2>[공통 기능]</h2>
<h3>회원가입, 로그인</h3>
<br>
<img src="https://github.com/user-attachments/assets/9d9c51b5-6a1e-444d-81f9-7c784dcabeee" width="600px" height="600px" style="display: inline"><br>
<ul>
    <li>user DB에 작성한 ID와 PW가 일치할 시 로그인 가능</li>
    <li>카카오, 네이버, 구글 API를 연동하여 외부 계정으로 로그인 가능</li>
    <li>외부 api로 로그인 시 user DB에 사용자 이름과 일치할 시 바로 로그인 / 존재하지 않는다면 회원가입 페이지로 이동</li>
</ul>


<img src="https://github.com/user-attachments/assets/9937f234-df9d-4ae6-b73d-ff93d3762dc2" width="600px" height="600px" style="display: inline">
<ul>
    <li>mailsender를 통해 이메일 입력 후 입력한 이메일로 인증번호 전송</li>
    <li>인증번호 일치 시 아이디 사용 가능</li>
</ul>

<h3>중고 거래 물품 게시글 확인 및 원하는 물품 게시글 검색 가능</h3>
<br>
<img src="https://github.com/user-attachments/assets/7d1ce7ef-bcf2-4835-8cc7-d6e5357ea40b" width="600px" height="600px" style="display: inline"><br>
<ul>
    <li>비로그인 시, 메인페이지에서 등록된 물품 검색 및 확인 가능</li>
    <li>로그인 시, 메인페이지에서 채팅창, 게시글 등록, 게시글로 이동 가능</li>
</ul>

<h2>[사용자 기능]</h2>
<br>
<h3>구입하고 싶은 물품 게시글 열람</h3>
<br>

<img src="https://github.com/user-attachments/assets/53b86c5b-a488-405d-9b4c-686d68a0e5d2" width="600px" height="600px" style="display: inline"><br>
<ul>
    <li>사용자가 등록한 게시글 내용 및 사진을 확인 가능</li>
    <li>사용자가 등록한 게시글 6개를 랜덤으로 추천해줌</li>
    <li>게시글 등록자와 채팅보내기 버튼을 통해 채팅 가능</li>
</ul>
<img src="https://github.com/user-attachments/assets/f6c6bd04-d0fa-41eb-a766-ec3d9b6aa964" width="600px" height="600px" style="display: inline"><br>
<ul>
    <li>STOMP를 이용해 사용자들간에 채팅기능 구현</li>
</ul>
<img src="https://github.com/user-attachments/assets/2680784a-9174-4a13-a0fe-991ef4bba03d" width="600px" height="600px" style="display: inline"><br>
<ul>
    <li>사용자가 판매를 원하는 물품 등록 가능</li>
    <li>판매 제품 사진 다수 업로드 가능</li>
</ul>

