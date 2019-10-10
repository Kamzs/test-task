package test.java;

import com.ambro.main.ModelObject;
import com.ambro.main.RetrieveData;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tests {

    private RetrieveData retrieveData = new RetrieveData();
    private List<ModelObject> listOfUsers = retrieveData.getListOfUsers();

    @Test
    public void testList() {
        assertNotNull(listOfUsers);
    }

    @Test
    public void dataReadTest() {
        assertEquals(4, listOfUsers.size());
    }

    @Test
    public void getOldestUserWithPhoneTest() {

        ModelObject user1 = new ModelObject("Artur", "Bak", LocalDate.of(1993, 5, 4), 77788899);
        ModelObject user2 = new ModelObject("Sebastian", "Korek", LocalDate.of(1991, 8, 5), 85543899);
        ModelObject user3 = new ModelObject("Karol", "Bialy", LocalDate.of(1990, 8, 5), null);

        List<ModelObject> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        assertNotEquals(user1, retrieveData.getOldestUserWithPhone(list));
        assertEquals(user2, retrieveData.getOldestUserWithPhone(list));
    }

    @Test
    public void getBirthDateTest(){
        String testDate = "2019-10-08";
        assertEquals(LocalDate.of(2019,10,8),RetrieveData.getBithDate(testDate));
    }

}
