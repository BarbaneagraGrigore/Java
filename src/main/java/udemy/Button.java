package udemy;

public class Button {
    private String title;
    private OnClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void onClick() {
        this.onClickListener.onClick(this.title);
    }

    public interface OnClickListener {
        void onClick(String title);
    }
}

//    private static final Scanner scanner = new Scanner(System.in);
//    private static final Button button = new Button("Print");
// class ClickListener implements Button.OnClickListener {
////            public ClickListener() {
////                System.out.println("I've been attached");
////            }
////
////            @Override
////            public void onClick(String title) {
////                System.out.println(title + " was clicked");
////            }
////        }
////        button.setOnClickListener(new ClickListener());
//        button.setOnClickListener(new Button.OnClickListener() {
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        });
//        listen();
//private static void listen() {
//        boolean quit = false;
//        while (!quit) {
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//            switch (choice) {
//                case 0:
//                    quit = true;
//                    break;
//                case 1:
//                    button.onClick();
//                    break;
//            }
//        }
//    }
