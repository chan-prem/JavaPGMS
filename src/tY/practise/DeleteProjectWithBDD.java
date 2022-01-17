package tY.practise;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class DeleteProjectWithBDD {
	
@Test	
public void deleteProject()
{
	
 when()
 .delete("http://localhost:8084/projects/TY_PROJ_1202");
.then()
.assertThat()
.statusCode(204)
.log().all();
}
}