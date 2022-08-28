package OOP.ManagementLibrary;

import OOP.ManagementLibrary.Entity.Book;
import OOP.ManagementLibrary.Entity.Order;
import OOP.ManagementLibrary.Entity.OrderDetail;
import OOP.ManagementLibrary.Entity.Reader;

import java.util.Scanner;

public class Main {

    private static Reader[] READERS = new Reader[100];
    private static Book[] BOOKS = new Book[100];
    private static Order[] ORDERS = new Order[100];

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        while (true) {
            int functionChoice = functionChoice();
            switch (functionChoice) {
                case 1:
                    inputNewReader();
                    break;
                case 2:
                    showAllReader();
                    break;
                case 3:
                    inputNewBook();
                    break;
                case 4:
                    showAllBook();
                    break;

                case 5:
                    createOrder();
                    showAllOrder();
                    break;
                case 6:
                    sortOrderByReaderName();
                    break;
                case 7:
                    sortOrderByQuantity();
                    break;

                case 8:
                    searchOrderByName();
                    break;
                case 9:
                    System.out.println("Xin cảm ơn đã sử dụng phần mềm của chúng tôi!");
                    return;
            }
        }
    }

    private static int functionChoice() {
        System.out.println("\n\n===== PHẦN MỀM QUẢN LÝ MƯỢN SÁCH THƯ VIỆN =====\n\n");
        System.out.println("1. Nhập danh sách bạn đọc mới.");
        System.out.println("2. In ra danh sách bạn đọc trong hệ thống.");
        System.out.println("3. Nhập danh sách sách mới.");
        System.out.println("4. In ra danh sách sách trong hệ thống.");
        System.out.println("5. Lập phiếu mượn sách cho bạn đọc.");
        System.out.println("6. Sắp xếp danh sách phiếu mượn theo họ tên bạn đọc.");
        System.out.println("7.Sắp xếp danh sách mượn theo số lượng cuốn sách.");
        System.out.println("8.Tìm kiếm và hiển thị danh sách mượn theo tên bạn đọc.");
        System.out.println("9. Thoát chương trình");
        System.out.println("--------------------------------------");
        System.out.print("Xin mời nhập lựa chọn của bạn: ");
        int functionChoice = -1;
        do {
            functionChoice = new Scanner(System.in).nextInt();
            if (functionChoice >= 1 && functionChoice <= 9) {
                break;
            }
            System.out.print("Chức năng được chọn không hợp lệ, vui lòng chọn lại: ");
        } while (functionChoice > 9 || functionChoice < 1);
        return functionChoice;
    }

    private static void inputNewReader() {
        // xử lý nhập khách hàng mới
        System.out.print("Nhập số lượng bạn đọc mới muốn thêm: ");
        int newCustomerNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < newCustomerNumber; i++) {
            System.out.println("Nhập thông tin cho bạn đọc thứ " + (i + 1));
            // thực hiện nhập thông tin cho bạn đọc
            Reader reader = new Reader();
            reader.inputInfo();

            // lưu vào hệ thống ==> thêm vào mảng READERS đã khai báo bên trên
            saveReader(reader);
        }
    }

    private static void saveReader(Reader reader) {
        for (int j = 0; j < READERS.length; j++) {
            if (READERS[j] == null) {
                READERS[j] = reader;
                break;
            }
        }
    }

    private static void showAllReader() {
        for (int i = 0; i < READERS.length; i++) {
            if (READERS[i] == null) {
                continue;
            }
            System.out.println(READERS[i]);
        }
    }

    private static void inputNewBook() {
        // xử lý nhập điện thoại mới
        System.out.print("Nhập số lượng sách mới muốn thêm: ");
        int newBookNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < newBookNumber; i++) {
            System.out.println("Nhập thông tin cho cuốn sách thứ " + (i + 1));
            // thực hiện nhập thông tin cho sách
            Book book = new Book();
            book.inputInfo();

            // lưu vào hệ thống ==> thêm vào mảng BOOKS đã khai báo bên trên
            saveBook(book);
        }
    }

    private static void saveBook(Book book) {
        for (int i = 0; i < BOOKS.length; i++) {
            if (BOOKS[i] == null) {
                BOOKS[i] = book;
                break;
            }
        }
    }

    private static void showAllBook() {
        for (int i = 0; i < BOOKS.length; i++) {
            if (BOOKS[i] == null) {
                continue;
            }
            System.out.println(BOOKS[i]);
        }
    }

    private static void createOrder() {
        // kiểm tra xem danh sách bạn đọc và sách có dữ liệu hay chưa
        if (!checkData()) {
            System.out.println("Chưa có dữ liệu về bạn đọc hoặc sách để thao tác, vui lòng nhập bạn đọc và sách trước đã!");
            return;
        }

        // 0. nhập số lượng bạn đọc muốn mượn sách
        System.out.print("Nhập số lượng bạn đọc muốn mượn sách: ");
        int readerNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < readerNumber; i++) {
            Order order = new Order();
            // 1. xác định được xem là bạn đọc nào là người muợn
            // ==> bắt người dùng nhập ID của bạn đọc
            Reader reader = nhapBanDoc(i);
            // lưu bạn đọc vào phiếu mượn
            order.setReader(reader);

            // 2. xác định xem bạn đọc này muợn những đầy sách nào
            OrderDetail[] orderDetails = createOrderDetail();
            order.setOrderDetails(orderDetails);

            // lưu luôn vào danh sách order
            saveOrder(order);
        }
    }

    private static boolean checkData() {
        boolean coDuLieuBanDoc = false;
        for (int i = 0; i < READERS.length; i++) {
            if (READERS[i] != null) {
                coDuLieuBanDoc = true;
                break;
            }
        }
        boolean coDuLieuSach = false;
        for (int i = 0; i < BOOKS.length; i++) {
            if (BOOKS[i] != null) {
                coDuLieuSach = true;
                break;
            }
        }
        return coDuLieuSach && coDuLieuBanDoc;
    }
    private static OrderDetail[] createOrderDetail() {
        System.out.print("Nhập số lượng đầu sách mà bạn đọc này muốn mượn: ");
        int bookQuantity;
        do {
            bookQuantity = new Scanner(System.in).nextInt();
            if (bookQuantity > 0 && bookQuantity<=5) {
                break;
            }
            System.out.print("Số lượng đầu sách muốn mượn phải là số dương, và tối đa 5 đầu sách vui lòng nhập lại: ");
        } while (true);
        OrderDetail[] orderDetails = new OrderDetail[bookQuantity];
        for (int j = 0; j < bookQuantity; j++) {
            OrderDetail orderDetail = new OrderDetail();
            // 2.1. xác định được xem là bạn đọc mua điện thoại nào
            // ==> bắt người dùng nhập ID của sách muốn muợn

            Book book = nhapSach(j);
            // lưu điện thoại tìm được vào chi tiết phiếu mượn (orderDetail)
            orderDetail.setBook(book);

            System.out.print("Nhập số lượng muốn mượn: ");
            int quantity;
            do {
                quantity = new Scanner(System.in).nextInt();
                if (quantity > 0&&quantity<=3) {
                    break;
                }
                System.out.print("Số lượng muốn mượn phải là số dương, và tối đa 3 cuốn vui lòng nhập lại: ");
            } while (true);
            orderDetail.setQuantity(quantity);

            // lưu chi tiết phiếu mượn vừa nhập
            for (int i = 0; i < orderDetails.length; i++) {
                if (orderDetails[i] == null) {
                    orderDetails[i] = orderDetail;
                    break;
                }
            }
        }
        return orderDetails;
    }

    private static Reader nhapBanDoc(int index) {
        System.out.print("Xin mời nhập mã bạn đọc thứ " + (index + 1) + " muốn mượn sách: ");
        int idReader;
        Reader reader;
        do {
            idReader = new Scanner(System.in).nextInt();
            // thực hiện tìm kiếm bạn đọc theo id vừa nhập xem có khách hàng trong hệ thống hay không
            // nếu có thì oke, nếu KHÔNG thì bắt người dùng nhập lại
            reader = searchReaderById(idReader);
            if (reader != null) {
                break;
            }
            System.out.print("Không tồn tại bạn đọc có ID là " + idReader + ", vui lòng nhập lại: ");
        } while (true);
        return reader;
    }
    private static Book nhapSach(int index) {
        System.out.print("Xin mời nhập ID của cuốn sách thứ " + (index + 1) + " mà bạn đọc này muốn mượn: ");
        int idBook;
        Book book;
        do {
            idBook = new Scanner(System.in).nextInt();
            // thực hiện tìm kiếm khách hàng theo id vừa nhập xem có khách hàng trong hệ thống hay không
            // nếu có thì oke, nếu KHÔNG thì bắt người dùng nhập lại
            book = searchBookById(idBook);
            if (book != null) {
                break;
            }
            System.out.print("Không tồn tại sách có ID là " + idBook + ", vui lòng nhập lại: ");
        } while (true);
        return book;
    }
    private static void saveOrder(Order order) {
        for (int i = 0; i < ORDERS.length; i++) {
            if (ORDERS[i] == null) {
                ORDERS[i] = order;
                return;
            }
        }
    }

    private static void showAllOrder() {
        for (int i = 0; i < ORDERS.length; i++) {
            Order order = ORDERS[i];
            if (order != null) {
                System.out.println("Bạn đọc " + order.getReader().getName() + " đã mượn các cuốn sách sau: ");
                for (int j = 0; j < order.getOrderDetails().length; j++) {
                    System.out.println(order.getOrderDetails()[j]);
                }
                System.out.println("-------------------------------");
            }
        }

    }

    private static Book searchBookById(int idPhone) {
        for (int i = 0; i < BOOKS.length; i++) {
            Book book = BOOKS[i];
            if (book != null && book.getId() == idPhone) {
                return book;
            }
        }
        return null;
    }
    private static Reader searchReaderById(int idReader) {
        for (int i = 0; i < READERS.length; i++) {
            Reader reader = READERS[i];
            if (reader != null && reader.getId() == idReader) {
                return reader;
            }
        }
        return null;
    }

    private static void sortOrderByReaderName() {
        // kiểm tra xem trong ORDER đã có dữ liệu hay chưa
        boolean coDuLieuPhieuMuon = false;
        for (int i = 0; i < ORDERS.length; i++) {
            if (ORDERS[i] != null) {
                coDuLieuPhieuMuon = true;
            }
        }
        if (!coDuLieuPhieuMuon) {
            System.out.println("Chưa có phiếu mượn nào trong hệ thống, vui lòng tạo phiếu mượn trước khi thực hiện tính năng này.");
            return;
        }
        sortOrderName();
        showAllOrder();
    }
    private static void sortOrderName() {
        for (int i = 0; i <ORDERS.length-1; i++) {
            Order order = ORDERS[i];
            for (int j = i + 1; j < ORDERS.length; j++) {
                Order order2 = ORDERS[j];
                if (order.getReader().getName().compareTo(order2.getReader().getName()) > 0) {
                    Order temp = order;
                    order = order2;
                    order2 = temp;
                }
            }
        }
    }

    private static void sortOrderByQuantity() {
        boolean checkDataOder = false;
        for (int i = 0; i < ORDERS.length; i++) {
            if (ORDERS[i] != null) {
                checkDataOder = true;
            }
        }
        if (checkDataOder) {
            System.out.println("Chưa có phiếu nào trong hệ thống, vui lòng tạo phiếu mượn trước khi thực hiện tính năng này.");
            return;
        }
        sortOrderQuantity();
        showAllOrder();
    }

    private static int count(OrderDetail [] orderDetails){
        int count = 0;
        for(int i =0 ; i < orderDetails.length; i++){
            count = count + orderDetails[i].getQuantity();
        }
        return count ;
    }
    private static void sortOrderQuantity() {
        for (int i = 0; i < ORDERS.length - 1; i++) {
            Order order = ORDERS[i];
            for (int j = i + 1; j < ORDERS.length; j++) {
                Order order1 = ORDERS[j];
                if ( count(order.getOrderDetails()) > count(order1.getOrderDetails())) {
                    Order temp = order;
                    order = order1;
                    order1 = temp;
                }
            }
        }
    }

    private static Order searchOrderByReaderName(String nameSearch) {
        for (int i = 0; i < ORDERS.length; i++) {
            Order order = ORDERS[i];
            if (order != null && order.getReader().getName().equalsIgnoreCase(nameSearch)) {
                return order;
            }
        }
        return null;
    }

    private static void searchOrderByName() {
        System.out.print("Nhập tên bạn đọc cần tìm: ");
        String nameSearch;
        Order order;
        do {
            nameSearch = new Scanner(System.in).nextLine();

            order = searchOrderByReaderName(nameSearch);
            if (order != null) {
                OrderDetail [] orderDetails = order.getOrderDetails();
                for (int i = 0; i < orderDetails.length; i++){
                    System.out.println(orderDetails[i]);
                }
                break;
            }
            System.out.print("Không tìm thấy bạn đọc có tên là" + nameSearch + ", nhập lại: ");
        } while (true);
    }






}
