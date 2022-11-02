public class ContinueBreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("start" + i);
            if (i == 8) {

                break;
                //  continue;
            }
            System.out.println("end");
        }
        }
    }
