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
<img src="https://private-user-images.githubusercontent.com/148042427/359447869-ab3245bb-5fb2-4bc5-9079-daff5d19ef16.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjQxNjY0NzEsIm5iZiI6MTcyNDE2NjE3MSwicGF0aCI6Ii8xNDgwNDI0MjcvMzU5NDQ3ODY5LWFiMzI0NWJiLTVmYjItNGJjNS05MDc5LWRhZmY1ZDE5ZWYxNi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODIwJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgyMFQxNTAyNTFaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1iMWU0OTRjOTc4N2ViZjM4MzU2Y2ExMzMwMzk1MTQ0ZjRkNmJlODJiNmFmYmZhM2FmZmM3Y2I4MGM3N2M1MmJjJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.KNzPaoua954sq_cuX8dsqt8ZcXzklG1inFlKJRJluJE"/>

<h1>기술 스택</h1>
<br>
<img src="https://skillicons.dev/icons?i=html,css,javascript,java,spring,mysql,theme=light">
<br>

<h1>주요기능</h1>
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
                    - 중고 거래 물품 게시글 확인 가능
                    - 원하는 물품 게시글 검색 가능
                </td>
                <td>
                    - 구입하고 싶은 물품 게시글 열람 가능 <br>
                    - 판매하고 싶은 물품 게시글 등록 가능 <br>
                    - 구입하려는 물품을 판매하는 판매자와 채팅 가능
                </td>
            </tr>
        </tbody>
    </table>
<h2>[공통 기능]</h2>
<h3>회원가입, 로그인</h3>
<ul>
    <li>사용자는 이메일,비밀번호,이름,휴대폰번호 등을 이용해 회원가입 할 수 있다.</li>
    <li>사용자는 작성한 이메일로 보내진 인증번호 작성 후 회원가입을 할 수 있다.</li>
    <li>회원가입 시 사용한 아이디와 비밀번호를 통해 로그인 할 수 있다.</li>
    <li>외부 링크로 로그인 시, 회원가입한 개인정보와 일치 시 로그인 할 수 있다.</li>
</ul>
<img src="https://private-user-images.githubusercontent.com/148042427/359528073-9d9c51b5-6a1e-444d-81f9-7c784dcabeee.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjQxNjY5ODMsIm5iZiI6MTcyNDE2NjY4MywicGF0aCI6Ii8xNDgwNDI0MjcvMzU5NTI4MDczLTlkOWM1MWI1LTZhMWUtNDQ0ZC04MWY5LTdjNzg0ZGNhYmVlZS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODIwJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgyMFQxNTExMjNaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT04OGY2OGQ1ZThmZjYxY2ViYjlkNzk1YWRiZDllMTM4NzI0ZjM4OGQwYmI4NTU3YjlhZTM1M2U1Y2Y3MWVlM2VjJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.kcOdv52k8YeDBFkGJdOfJ93sEXzA-PvTPWOy6X__OIc" width="600px" height="600px" style="display: inline"><br>
<img src="https://private-user-images.githubusercontent.com/148042427/359528093-9937f234-df9d-4ae6-b73d-ff93d3762dc2.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjQxNjY5ODMsIm5iZiI6MTcyNDE2NjY4MywicGF0aCI6Ii8xNDgwNDI0MjcvMzU5NTI4MDkzLTk5MzdmMjM0LWRmOWQtNGFlNi1iNzNkLWZmOTNkMzc2MmRjMi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODIwJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgyMFQxNTExMjNaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1lZjI2NjJjOGMzMTE0MDYxMTk5ZTYzZjdmNmUyMGI3ZDhlN2YwNDRkYjcwMDI3MGFiYzdhYzM4MzEwNGNjZDY4JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.eOnQHkaR0ZKJ0IIvQZsNutdFIih_PjmFixt-fYV-Hyo" width="600px" height="600px" style="display: inline">
