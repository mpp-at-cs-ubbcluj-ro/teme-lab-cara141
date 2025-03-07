import scs.ubb.mpp.model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComputerRepairRequestTest {
    @Test
    @DisplayName("Test for ComputerRepairRequest")
    public void testComputerRepairRequest() {
        ComputerRepairRequest computerRepairRequest = new ComputerRepairRequest(1, "John", "Cluj", "0740123456", "Dell", "2021-03-01", "The computer does not start");
        assertEquals(1, computerRepairRequest.getID());
        assertEquals("John", computerRepairRequest.getOwnerName());
        assertEquals("Cluj", computerRepairRequest.getOwnerAddress());
        assertEquals("0740123456", computerRepairRequest.getPhoneNumber());
        assertEquals("Dell", computerRepairRequest.getModel());
        assertEquals("2021-03-01", computerRepairRequest.getDate());
        assertEquals("The computer does not start", computerRepairRequest.getProblemDescription());
    }
}
