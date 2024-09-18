# 주요 설명

- 참고1: 데모에 **`local`** Profile을 설정한 이유  
  <p>Jasypt 암복호화를 통한 환경변수 대체는 개발자 작업 환경에만 사용을 권하기 때문에 예시도 로컬 프로파일 적용을 전제로 구현합니다.</p>
- 참고2: Jasypt Key를 공개하지 마십시오.  
  <p>예제 외에는 Jasypt 키를 레포지터리로 공유하면 안 되며, Jasypt 키를 선택할 때는 예제에서 공개한 Jasypt 키를 제외해야 합니다.</p>
 
# Jasypt 암복호화: Alternatives to Local Environment Variables

이 프로젝트는 로컬 환경변수 사용을 대신하기 위하여 Jasypt 암복호화를 사용합니다.

# Jasypt Encryption: Alternatives to Local Environment Variables

This project uses Jasypt encryption to replace local environment variables.

- Do not share your `JASYPT_KEY`.
  - This project should show an example of using jasypt encryption and decryption. So I provide the key in public.
  - If your project doesn't have the same purpose to show an example using the key, `JASYPT_KEY` must be private.

- Jasypt does not upgrade the security of your project over using environment variables directly.
  - What JASYPT encryption provides is ease of development, productivity, and reduced communication costs, while maintaining sufficient security.
  - Some sensitive information is still better provided via environment variables.

# Run

## Preparation

Add `local` to the active profiles. Include this option in the VM options:

```shell
-Dspring.profiles.active=local
```

Your IDE will provide easy way to include it.

- If you are using the **_Intellij Ultimate edition,_** find the **_active profiles_** in the run/debug configurations window and enter `local` in "Active profiles".  
- If you are using the **_Intellij Community edition,_** find the **_VM options_** in the run/debug configurations window and enter `-Dspring.profiles.active=local`.

If running as `jar` with the option, see this example:

```shell
java -Dspring.profiles.active=local -jar Example.jar
```
