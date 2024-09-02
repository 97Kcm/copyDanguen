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
<img src="https://private-user-images.githubusercontent.com/148042427/359447869-ab3245bb-5fb2-4bc5-9079-daff5d19ef16.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjUyNTk0NDQsIm5iZiI6MTcyNTI1OTE0NCwicGF0aCI6Ii8xNDgwNDI0MjcvMzU5NDQ3ODY5LWFiMzI0NWJiLTVmYjItNGJjNS05MDc5LWRhZmY1ZDE5ZWYxNi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwOTAyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDkwMlQwNjM5MDRaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0yMGEwMTdkMGE3NTM2MTgzNzAzNTc3N2RjODU2OTVmY2JjNGMyZjAyNTYwZjA1MGZmODhhMDRlMDU4NWYwYTEwJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.OJqlIQG1sl1W6LS99pdDDoyk_PiUl9tvQQGyCRYOW0E"/>

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
<img src="https://private-user-images.githubusercontent.com/148042427/359528073-9d9c51b5-6a1e-444d-81f9-7c784dcabeee.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjUyNTk0NDQsIm5iZiI6MTcyNTI1OTE0NCwicGF0aCI6Ii8xNDgwNDI0MjcvMzU5NTI4MDczLTlkOWM1MWI1LTZhMWUtNDQ0ZC04MWY5LTdjNzg0ZGNhYmVlZS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwOTAyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDkwMlQwNjM5MDRaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT03NzBjZGIzYTNjZjA2NmMyZjI2ZTZlMWFhYTc4MzI4YzU3Y2VkZWE0MzY3Zjc3YjNjYjExZTJkZDZkMDE2YzY3JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.uHFqfL69SWaiBomV3bk8Eewp7WcWzh5bJgynQyGOhKQ" width="600px" height="600px" style="display: inline"><br>
<img src="https://private-user-images.githubusercontent.com/148042427/359528093-9937f234-df9d-4ae6-b73d-ff93d3762dc2.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjUyNTk0NDQsIm5iZiI6MTcyNTI1OTE0NCwicGF0aCI6Ii8xNDgwNDI0MjcvMzU5NTI4MDkzLTk5MzdmMjM0LWRmOWQtNGFlNi1iNzNkLWZmOTNkMzc2MmRjMi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwOTAyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDkwMlQwNjM5MDRaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT00NjJmMTA3MjllMGU4YjM3MzY1ODQyYzljNTJmYTAxNTY4YTUxMTdhMTY1NjRjMTA4YmVhMWFmN2I0N2JlYzliJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.DJshUwDRy9OgUFDfZ3BuXIBlPavBwo-9tT9skbB4FVQ" width="600px" height="600px" style="display: inline">

<h3>중고 거래 물품 게시글 확인 및 원하는 물품 게시글 검색 가능</h3>
<ul>
    <li>사용자는 메인 페이지에서 작성되어있는 판매자들의 게시글들을 확인할 수 있다.</li>
    <li>사용자는 메인 페이지에서 카테고리 및 지역으로 게시글들을 분류시킬 수 있다.</li>
    <li>사용자는 메인 페이지에서 검색을 통해 원하는 물품을 검색할 수 있다.</li>
</ul>
<br>
<img src="https://private-user-images.githubusercontent.com/148042427/359528077-7d1ce7ef-bcf2-4835-8cc7-d6e5357ea40b.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjUyNTk0NDQsIm5iZiI6MTcyNTI1OTE0NCwicGF0aCI6Ii8xNDgwNDI0MjcvMzU5NTI4MDc3LTdkMWNlN2VmLWJjZjItNDgzNS04Y2M3LWQ2ZTUzNTdlYTQwYi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwOTAyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDkwMlQwNjM5MDRaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1hMmY4NjQyYmViMmQ5YmQ5ZGM2NTU1NTNlZDdhZjYyYzQ0Yjg0NjJhMzExZGM0N2ZmODE4ZWYzMDA4NzMzYTcwJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.SYlblSdvSRxxQXzFTVizbsc_1_Mvc-GNUTGaOJEq8q8" width="600px" height="600px" style="display: inline"><br>

<h2>[사용자 기능]</h2>
<br>
<h3>구입하고 싶은 물품 게시글 열람</h3>
<br>
<ul>
    <li>판매자가 작성해놓은 판매글을 열람이 가능하다.</li>
    <li>구매를 원한다면 판매자와 1대1 채팅을 지원한다.</li>
    <li>판매를 하고싶은 물품이 있다면 게시글 작성을 통해 판매물품을 등록 가능하다.</li>
</ul>

<img src="https://private-user-images.githubusercontent.com/148042427/359528065-53b86c5b-a488-405d-9b4c-686d68a0e5d2.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjUyNTk0NDQsIm5iZiI6MTcyNTI1OTE0NCwicGF0aCI6Ii8xNDgwNDI0MjcvMzU5NTI4MDY1LTUzYjg2YzViLWE0ODgtNDA1ZC05YjRjLTY4NmQ2OGEwZTVkMi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwOTAyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDkwMlQwNjM5MDRaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0wYWY5YzcwMWYxYWRmOWQ2MDg1MmEwZDMwNTliMWQ4NmI1NDBkZDQwY2EzZTdjY2Q2NzI2NDQ0ODBiYWJlNDYzJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.2ro3kshp3Cf5IhObEmofk0-nM5WULPK_AcO1mw2leP8" width="600px" height="600px" style="display: inline"><br>
<img src="https://private-user-images.githubusercontent.com/148042427/359528089-f6c6bd04-d0fa-41eb-a766-ec3d9b6aa964.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjUyNTk0NDQsIm5iZiI6MTcyNTI1OTE0NCwicGF0aCI6Ii8xNDgwNDI0MjcvMzU5NTI4MDg5LWY2YzZiZDA0LWQwZmEtNDFlYi1hNzY2LWVjM2Q5YjZhYTk2NC5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwOTAyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDkwMlQwNjM5MDRaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0yNGNjMzI4NDVhZTU1MDRjNjAzZjY3OTVjNTg5NGFmODc1ZTI2MjA3YjY1M2YxM2RmMjZmYTU3YTc5ZDZjMzEwJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.k5bV0ZSrr5-Kno74qQfqV4UDRYk1VIQfuf9dihOMbcM" width="600px" height="600px" style="display: inline"><br>
<img src="https://private-user-images.githubusercontent.com/148042427/359578375-2680784a-9174-4a13-a0fe-991ef4bba03d.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjUyNTk0NDQsIm5iZiI6MTcyNTI1OTE0NCwicGF0aCI6Ii8xNDgwNDI0MjcvMzU5NTc4Mzc1LTI2ODA3ODRhLTkxNzQtNGExMy1hMGZlLTk5MWVmNGJiYTAzZC5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwOTAyJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDkwMlQwNjM5MDRaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT04NDY1ODZiZWZlNTkzOTIxZjlhZDgxNjg0YTdiMmZiOGI3OGZlYzVkOTY2NTc1NjJhODkxZGViMjU0YWRjMmJkJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.Q_SdxAK5tkbnlwdhBQXBjiZuSJ9bB5E_c0HYD3XvH5A" width="600px" height="600px" style="display: inline"><br>

