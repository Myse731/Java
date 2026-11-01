package ErrorTakeObject;

class FinallyTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            deleteTempFiles();
        }
    }

    static void startInstall() {
        System.out.println("설치 시작");
    }
    static void copyFiles() throws Exception{
        System.out.println("파일 복사");
        throw new Exception();
    }
    static void deleteTempFiles() {
        System.out.println("임시 파일 삭제");
    }
}