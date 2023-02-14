# dokka-paparazzi-integration

개발자에게 문서화는 정말 중요합니다. 우리는 디자인 시스템의 문서화라면 더더욱 중요하다고 생각합니다.

꽥꽥은 문서화 툴로 [`Kotlin/dokka`](https://github.com/Kotlin/dokka)를 사용합니다. 하지만 dokka는 디자인 시스템 문서용이 아니기에 이 컴포넌트가 어떻게 보이는지는 나타낼 수 없다는 아쉬움이 있습니다. 우리는 이 아쉬움을 극복하고자 합니다.

꽥꽥은 모두 [Jetpack Compose](https://developer.android.com/jetpack/compose)로 개발되며, [`cashapp/paparazzi`](https://github.com/cashapp/paparazzi)를 이용하면 컴포저블의 UI 스냅샷을 디바이스 없이 찍을 수 있습니다. 그렇다면 dokka와 paparazzi를 합친다면 어떨까요?

개발자에게 최상의 경험을 선사하는 문서화를 할 수 있을 거라 기대합니다.

### 목표

- dokka를 뽑을 때 paparazzi를 통해 자동으로 UI 스냅샷을 생성하고
- 생성된 UI 스냅샷 이미지와 해당 컴포넌트의 KDoc을 연결시켜서
- dokka의 최종 결과물을 markdown으로 나타낸다.

### 디자인 토큰

- UI 스냅샷 이미지는 각각 디자인 토큰에 맞게 여러 장 생성됩니다.
- 디자인 토큰은 `@SugarToken` 어노테이션 여부로 판단합니다. 자세한 내용은 [`core-sugar-annotation`](../core-sugar-annotation) 모듈의 README를 참고하세요.