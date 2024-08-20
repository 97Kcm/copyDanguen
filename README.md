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
<ul>
    <li>사용자는 이메일,비밀번호,이름,휴대폰번호 등을 이용해 회원가입 할 수 있다.</li>
    <li>사용자는 작성한 이메일로 보내진 인증번호 작성 후 회원가입을 할 수 있다.</li>
    <li>회원가입 시 사용한 아이디와 비밀번호를 통해 로그인 할 수 있다.</li>
    <li>외부 링크로 로그인 시, 회원가입한 개인정보와 일치 시 로그인 할 수 있다.</li>
</ul>
<br>
<img src="https://private-user-images.githubusercontent.com/148042427/359528073-9d9c51b5-6a1e-444d-81f9-7c784dcabeee.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjQxNjY5ODMsIm5iZiI6MTcyNDE2NjY4MywicGF0aCI6Ii8xNDgwNDI0MjcvMzU5NTI4MDczLTlkOWM1MWI1LTZhMWUtNDQ0ZC04MWY5LTdjNzg0ZGNhYmVlZS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODIwJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgyMFQxNTExMjNaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT04OGY2OGQ1ZThmZjYxY2ViYjlkNzk1YWRiZDllMTM4NzI0ZjM4OGQwYmI4NTU3YjlhZTM1M2U1Y2Y3MWVlM2VjJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.kcOdv52k8YeDBFkGJdOfJ93sEXzA-PvTPWOy6X__OIc" width="600px" height="600px" style="display: inline"><br>
<img src="https://private-user-images.githubusercontent.com/148042427/359528093-9937f234-df9d-4ae6-b73d-ff93d3762dc2.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjQxNjY5ODMsIm5iZiI6MTcyNDE2NjY4MywicGF0aCI6Ii8xNDgwNDI0MjcvMzU5NTI4MDkzLTk5MzdmMjM0LWRmOWQtNGFlNi1iNzNkLWZmOTNkMzc2MmRjMi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODIwJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgyMFQxNTExMjNaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1lZjI2NjJjOGMzMTE0MDYxMTk5ZTYzZjdmNmUyMGI3ZDhlN2YwNDRkYjcwMDI3MGFiYzdhYzM4MzEwNGNjZDY4JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.eOnQHkaR0ZKJ0IIvQZsNutdFIih_PjmFixt-fYV-Hyo" width="600px" height="600px" style="display: inline">

<h3>중고 거래 물품 게시글 확인 및 원하는 물품 게시글 검색 가능</h3>
<ul>
    <li>사용자는 메인 페이지에서 작성되어있는 판매자들의 게시글들을 확인할 수 있다.</li>
    <li>사용자는 메인 페이지에서 카테고리 및 지역으로 게시글들을 분류시킬 수 있다.</li>
    <li>사용자는 메인 페이지에서 검색을 통해 원하는 물품을 검색할 수 있다.</li>
</ul>
<br>
<img src="https://private-user-images.githubusercontent.com/148042427/359528077-7d1ce7ef-bcf2-4835-8cc7-d6e5357ea40b.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjQxNzA2OTEsIm5iZiI6MTcyNDE3MDM5MSwicGF0aCI6Ii8xNDgwNDI0MjcvMzU5NTI4MDc3LTdkMWNlN2VmLWJjZjItNDgzNS04Y2M3LWQ2ZTUzNTdlYTQwYi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODIwJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgyMFQxNjEzMTFaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT05NTUwNzM0Y2VkMjk0YzlmNmE3MDJmMWQ3MzU4MzAzMjU0ZmEwYTczMmI5NjdkODY4MGU1NTFlNGExY2Y3Y2Q1JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.nEKzGPshPTD2egc3hrPdGfk28_JiDWcIeAt-qC5FNhY" width="600px" height="600px" style="display: inline"><br>

<h2>[사용자 기능]</h2>
<br>
<h3>구입하고 싶은 물품 게시글 열람</h3>
<br>
<ul>
    <li>판매자가 작성해놓은 판매글을 열람이 가능하다.</li>
    <li>구매를 원한다면 판매자와 1대1 채팅을 지원한다.</li>
    <li>판매를 하고싶은 물품이 있다면 게시글 작성을 통해 판매물품을 등록 가능하다.</li>
</ul>

<img src="https://private-user-images.githubusercontent.com/148042427/359528065-53b86c5b-a488-405d-9b4c-686d68a0e5d2.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjQxNzQ0MTMsIm5iZiI6MTcyNDE3NDExMywicGF0aCI6Ii8xNDgwNDI0MjcvMzU5NTI4MDY1LTUzYjg2YzViLWE0ODgtNDA1ZC05YjRjLTY4NmQ2OGEwZTVkMi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODIwJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgyMFQxNzE1MTNaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1mNDU3ZjUxYWU0M2NjYWJhMmJlODYxNTM4YmEwZTIyMmZjMjQ1ZDQwNzQ0NWE1NzM4ZjI0ZmM4NTliYTVhNzA2JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.MuGmhk_obaKxMKPBTHR2zWJliRew_XuHxa6qmYSuaVg" width="600px" height="600px" style="display: inline"><br>
<img src="https://private-user-images.githubusercontent.com/148042427/359528089-f6c6bd04-d0fa-41eb-a766-ec3d9b6aa964.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjQxNzQ0MTMsIm5iZiI6MTcyNDE3NDExMywicGF0aCI6Ii8xNDgwNDI0MjcvMzU5NTI4MDg5LWY2YzZiZDA0LWQwZmEtNDFlYi1hNzY2LWVjM2Q5YjZhYTk2NC5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODIwJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgyMFQxNzE1MTNaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1mN2Q2OTA0N2Q4OTY0YTJkYzNhNWFhMDU1OTRhZGU0Y2RjMjI4MTZlZWEwNGY3MmVhOWRiMWU3YTVmMjFlNWY1JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.-R61_cfwBUG33mtg1r26dHc0wvhSuf41vB1Xi0uS5Gg" width="600px" height="600px" style="display: inline"><br>
<img src="https://private-user-images.githubusercontent.com/148042427/359578375-2680784a-9174-4a13-a0fe-991ef4bba03d.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjQxNzQ1ODMsIm5iZiI6MTcyNDE3NDI4MywicGF0aCI6Ii8xNDgwNDI0MjcvMzU5NTc4Mzc1LTI2ODA3ODRhLTkxNzQtNGExMy1hMGZlLTk5MWVmNGJiYTAzZC5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODIwJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgyMFQxNzE4MDNaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT05YjEyNmU0OWU1NTU0NTk5ODEzYzgzZDk1NjQ5NGE3NTA5ZGUzZjQwNGEyNDBiOTIwOWM4ZWU4M2FmODM5OWIxJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.Oanitg7PoQk7gbAq9Ij6dAqQF5Qs9bTgCZ0-S5HZrk4" width="600px" height="600px" style="display: inline"><br>

