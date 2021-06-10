## 미션 소개
### 1단계 기능 요구 사항
- 레벨1 마지막 미션인 체스 애플리케이션 코드를 옮겨 온다.
- 새로 구현해도 되지만 기존 코드를 재사용하는 것을 추천
- 페어와 의논하여 하나의 코드로 합치기

### 2단계 기능 요구 사항
- Spring Framework를 활용하여 애플리케이션을 구동한다.
- Spark를 대체하여 Spring MVC를 활용하여 요청을 받고 응답을 한다.
- Spring JDBC를 활용하여 DB 접근하던 기존 로직을 대체한다.

### 3단계 기능 요구 사항
- 체스방 만들기
    - localhost:8080 요청 시 노출되는 페이지에 체스방을 만들 수 있는 버튼이 있다.
    - 체스방 만들기 버튼을 누르면 새로운 체스판이 초기화 된다.
    - 체스방에는 고유식별값이 부여된다. (이 고유 식별값은 체스방 주소에서 사용 됨)
- 체스방 목록 조회하기
    - localhost:8080 요청 시 체스방 목록을 조회할 수 있다
    - 체스방 목록에는 체스방 제목이 표시된다.
- 체스방 참여하기
    - localhost:8080 요청 시 체스방 목록에서 체스방을 클릭하면 체스 게임을 이어서 진행할 수 있다.

## 실행 결과
- 초기 화면  
![image](https://user-images.githubusercontent.com/56083021/121468231-685c9300-c9f5-11eb-99cc-0d82be01ec96.png)
</br></br>
- 새로운 방 생성  
![image](https://user-images.githubusercontent.com/56083021/121468272-7b6f6300-c9f5-11eb-936c-e2a1049469c0.png)
</br></br>
![image](https://user-images.githubusercontent.com/56083021/121468311-8d510600-c9f5-11eb-9a37-5238a5e28d59.png)
</br></br>
- 방 목록 조회  
![image](https://user-images.githubusercontent.com/56083021/121468466-cbe6c080-c9f5-11eb-8bd4-172e8c90c1f8.png)
</br></br>
- 방 참여하기  
![image](https://user-images.githubusercontent.com/56083021/121468537-e7ea6200-c9f5-11eb-9389-6dfd36462d76.png)
</br></br>
![image](https://user-images.githubusercontent.com/56083021/121468591-06505d80-c9f6-11eb-9126-db23294c75a4.png)

---
## Commit Convention

- 커밋 메시지 언어 : 한글.
- feat : 기능 추가.
- refactor : 구조 개선.
- fix : 에러가 나는 부분 해결.
- docs : document 파일 관련.
- test : 테스트 코드만 추가하거나 바꿀 때 사용.
- style : 들여쓰기, 변수명, 메소드명 수정 및 기타 수정 사항.
- 커밋 단위 : 기능 단위로 커밋을 하되, 테스트와 기능 커밋 구분.
  (단, 단순한 기능은 한 번에 커밋.)

## 서로의 코딩 습관

### 제이온

- 웬만한 변수 앞에 final 키워드 붙임.
- 이쁜 구조보다는 기능 구현이 우선.

### 검프

- 웬만한 변수 앞에 final 키워드 붙임.
- 이쁜 구조보다는 기능 구현이 우선.

### 맞춰가야할 점

- 클래스 앞에 final vs 필요할 때만 메소드 앞에 final.
    - 후자를 선택.
