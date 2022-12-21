public class Main {
    public static void main(String[] args) {
        Duck donald = new Duck();
        Duck daisy = new PekingDuck(); // ด้านหน้า genaral ด้านหลังต้องละเอียดกว่าหรือละเอียดเท่ากับตัวแรก

        Cow wagyu = new Cow();
        donald.clean(wagyu);
        donald.clean(daisy);

        daisy.clean(donald);

        donald.clean(new Cow()); //new Pig() ไม่สร้างชื่อให้มัน แสดงว่าใช้ครั้งเดียว มักพบในภาษาใหม่ๆ
    }
}