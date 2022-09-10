import com.bridgelabz.EmployeePayrollData;
import com.bridgelabz.EmployeePayrollService;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class EmployeePayrollServiceTest
{
    @Test
    public void given3Employees_WhenWrittenToFile_ShouldMatchEmployeeEntries()
    {
        EmployeePayrollData[] arrayOfEmployees = new EmployeePayrollData[]{
                new EmployeePayrollData(1, "Elon Musk", 100000.0),
                new EmployeePayrollData(2, "jeff Bezos", 200000.0),
                new EmployeePayrollData(3, "Bill Gates", 300000.0)
        };
        EmployeePayrollService employeePayrollService;
        employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmployees));
        employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);

    }
}