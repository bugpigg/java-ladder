# 2022 마스터즈 백엔드 사다리 게임 프로젝트
## 1단계 - 기본 기능 구현
### 기능 요구 사항
- [x] 간단한 사다리 게임 구현
- [x] n명의 사람과 m개의 사다리 개수 입력 가능
- [x] 사다리 라인은 랜덤 값에 따라 있거나 없음
- [x] 사다리 있으면 `-` 표시, 없으면 ` ` 표시, 양옆에는 `|` 로 세로 표시
- [x] 사다리 상태 화면에 출력
### 프로그래밍 요구 사항
- [x] 메서드 크기 최대 10라인 제한
- [x] 2차원 배열 학습하고,이를 적용  
- [ ] 메서드는 한가지 일만 하도록 작게  
    ㄴ 아직 부족한것 같다.

## 2단계 - 리팩토링 맛보기
### 프로그래밍 요구 사항
- [x] 메서드의 크기가 최대 10라인을 넘지 않도록 구현
- [x] 들여쓰기 depth 를 2단계에서 1단계로 줄이기
- [x] else 를 사용하지 말기
- [x] naming convention 지키기

## 3단계 - 사다리 모양 개선
### 기능 요구 사항
- [x] 플레이어 이름은 최대 5글자까지 부여 가능
- [x] 사다리 출력시 이름도 출력
- [x] 사람 이름은 쉼표(,)를 기준으로 구분
- [x] 사다리 폭도 넓어져야 함
- [x] 정상적으로 동작하려면 사다리 라인이 겹치지 않아야 함
- [x] `|-----|-----|`와 같은 상황이 없어야 함
### 프로그래밍 요구 사항
- [x] 메서드의 크기가 최대 10라인을 넘지 않도록 구현
- [x] 들여쓰기 depth 를 2단계에서 1단계로 줄이기
- [x] else 를 사용하지 말기
- [] 배열 대신 ArrayList 와 Generic 을 활용해 구현
    ㄴ 제너릭을 적절하게 활용하였는지 생각해보자.
### 3단계 결과

![result](https://user-images.githubusercontent.com/91416897/154242103-3f9d1c9e-87df-49d6-907d-437286043cab.png)

