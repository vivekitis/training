import java.util.ArrayList;
import java.util.List;

/**
 * Created by sumeet
 * on 13/7/17.
 */
public class ExceptionHandling {

    public static void demo1() {
        try {
            int a = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Divide By 0");
        }
    }

    public static void demo2() {
        try {
            int a = 1 / 0;
        } catch (IllegalArgumentException e) {
            System.out.println("Wont Catch");
        }
    }

    public static void demo3() {
        try {
            int a = 1 / 0;
        } catch (IllegalArgumentException e) {
            System.out.println("Wont Catch");
        } catch (Exception e) {
            System.out.println("Will Catch");
        }
    }

    public static void throwExample() throws CustomException {
        int i = 0;
        if (i == 0) {
            throw new CustomException("Custom Exception Occurred");
        }
    }

    public static void getDataFromDb() {
        try {
            //getting data from DB
        } catch (Exception e) {
            System.out.println("Error in Getting Data From DB");
        } finally {
            //clean up resources
            System.out.println("Cleaning the DB resources");
        }
    }

    public static int trick1() throws CustomException {
        try {
            return 1;
        } catch (Exception e) {
            System.out.println("Exception Occurred");
        } finally {
            throw new CustomException("U sir just got slammed");
        }
    }

    public static int trick2() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }

    public static void tryWithoutResource() {
        DataSource dataSource = null;
        try {
            dataSource = new DataSource();
            List<String> data = dataSource.getData();

        } catch (Exception e) {
            System.out.println("Error in getting Data");
        } finally {
            try {
                if (dataSource != null) {
                    dataSource.freeResource();
                }
            } catch (DbConnectionError e) {
                System.out.println("Cannot Free DataSource Resources");
            }
        }
    }

    public static void tryWithResource() {
        try (DataSource dataSource = new DataSource()) {
            List<String> data = dataSource.getData();
        } catch (Exception e) {
            System.out.println("Error in getting Data");
        }
    }

    public static void runtimeError() {
        try {
            List<String> list = new ArrayList<>();
            for (long i = 0; i < 9000000000L; i++) {
                if (i % 100000 == 0) {
                    System.out.println(i);
                }
                list.add(new String("Will Cause Error"));
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) throws Exception {
//        demo1();
//        demo3();
//        demo2();
//        throwExample();
//        getDataFromDb();
//        trick1();
//        trick2();
//        tryWithoutResource();
//        tryWithResource();
        runtimeError();
    }

}


class CustomException extends Exception {

    public CustomException(String message) {
        super(message);
    }
}

class DbConnectionError extends Exception {
    public DbConnectionError(String message) {
        super(message);
    }
}

class DbConnection {
    public void close() throws DbConnectionError {
    }
}

class DataSource implements AutoCloseable {

    private final DbConnection dbConnection;

    public DataSource() {
        this.dbConnection = new DbConnection();
    }

    public List<String> getData() {
        //using dbConnection fetch list
        return new ArrayList<>();
    }

    @Override
    public void close() throws DbConnectionError {
        freeResource();
    }

    public void freeResource() throws DbConnectionError {
        dbConnection.close();
    }
}