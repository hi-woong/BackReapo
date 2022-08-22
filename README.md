# :briefcase: BackTracking


사용자 맞춤 캠핑장 추천(홈페이지)를 만드는 팀 프로젝트입니다. <br>
## Position

- backend <Mybats 기능 흐름설계> <br>
- 그외 css 애니메이션 효과 <br>

## info
- :point_right:회원가입시 사용자의 지역을 입력받아 메인페이지 첫상단에 사용자의 가장 가까운 캠핑장을 슬라이드식으로 보여줍니다.
<br>

![KakaoTalk_20220822_101154745](https://user-images.githubusercontent.com/105634994/185822953-bf22a608-4c03-456a-acd4-07525c6e8097.png)

- :point_right:사용자에게 키워드를 여러 유형의 카테고리를 선택받아서 그 선택받은 결과를 토대로 DB안에 저장되어있는 값을 결과를 보여줍니다.
<br>

![total-image](https://user-images.githubusercontent.com/105634994/185830239-b285b526-9a94-418d-9f9b-e09b2514ae71.png)

- :point_right:결과페이지입니다. <br>

![KakaoTalk_20220822_115726324](https://user-images.githubusercontent.com/105634994/185830629-0e2052d4-185f-456b-be1d-49061c25b959.png)

## Technical difficulties

![KakaoTalk_20220822_101411226](https://user-images.githubusercontent.com/105634994/185832059-585ec5b5-1504-4f27-b8a4-8e2ad9400c55.png)
위 사진처럼 보이는 페이지는 필터링 검색 페이지 입니다. <br>
이 페이지에서는 각 키워드를 클릭하면 체크가 되면서 사용자가 체크한 값을 검색하여 오른쪽 화면에 사용자에게 보여주는 서비스를 구상했었습니다.<br>
하지만 우리는 category마다 체크되는 값을 Mybatis에서 가지고 온 후 select의 필요한 기술적인 어려움이 있었습니다. <br>
팀원들과 같이 협업하여 구글링을 통해 Map의 여러 가지 인터페이스 중 get() 성능이 빠르고 검색에 특화된 자료구조인 Key:value 형태를 가지는 HashMap으로 해결할 수 있었고 mapper 안에서 인라인 뷰를 사용하여 foreach문으로 올바른 값을 출력해줄 수 있었습니다.

## Resolove a Problem

![KakaoTalk_20220822_123646012](https://user-images.githubusercontent.com/105634994/185833657-0ea6cc54-4ac0-45c3-85de-4ce0b460fcbc.png)

하나의 form 태그안에서 각 카테고리 별로 name 값을 동일하게 주어서 filterService 내부에서 체크한 값들을 배열형태로 받아줍니다.


### filterService (내부)

![KakaoTalk_20220822_121328663](https://user-images.githubusercontent.com/105634994/185834844-f7435884-5c77-4a0a-8ee0-3d6194c14a34.png)


![KakaoTalk_20220822_125222951](https://user-images.githubusercontent.com/105634994/185836091-ac736460-2b02-4ce5-b573-9d16b9c9981f.png)

리스트를 불러와서 parameter로 받아론 배열의 크기만 만큼 add해줍니다. 그리고나서 Map 에 push!!


![KakaoTalk_20220822_121340035](https://user-images.githubusercontent.com/105634994/185836419-ecb3929c-06c3-4f9f-8f39-705d8ad06cb2.png)

### Mapper (내부)


![KakaoTalk_20220822_094609578](https://user-images.githubusercontent.com/105634994/185836483-1c16514b-5619-4b90-85dc-e11935f05437.png)











