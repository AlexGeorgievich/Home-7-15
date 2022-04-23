package tests.api;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.aeonbits.owner.ConfigFactory;
import org.json.JSONObject;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
//import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;

public class ShowWithToken {
/*
   Путь к регистрации на сайте https://reqres.in по АПИ = /api/register
   Учетные данные  = "email": "eve.holt@reqres.in",
                      "password": "pistol"
   Достоверность регистрации по значению полученного токена =  "token": "QpwL5tke4Pnpja7X4"
 */
    @Test
    @Owner("QA.GURU")
    @Tag("api")
    @Description("Регистрация на сайте и контроль достоверности токена")
    void getTokenTest2() {
        config.ApiConfig apiConfig = ConfigFactory.create(config.ApiConfig.class, System.getProperties());

        RestAssured.baseURI = apiConfig.baseURL();
        JSONObject requestBody = new JSONObject()
                .put("email", apiConfig.email())         // секретный логин
                .put("password", apiConfig.password());  //  пароль

        String token =
                given()
                        .contentType(ContentType.JSON)
                        .body(requestBody.toString())
                        .log().uri()
                        .log().body()
                        .when()
                        .post("/api/register")
                        .then()
                        .log().status()
                        .log().body()
                        .statusCode(200)
                        .body("token", is(apiConfig.token()))   // проверка достоверности токена
                        .extract().path("token");
//        System.out.println("Token: " + token);                    // а если посмотреть?
    }
}
