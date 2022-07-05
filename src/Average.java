public class Average {
    public static int calAverage(int[] grades){
        int sum=0;
        for (int grade: grades
        ) {
            sum+=grade;
        }
        return sum/ grades.length;
    }
    public static String getReview(int[] grades){
        int avg=calAverage(grades);
        if(avg>=9){
            return "Giỏi";
        }
        else if (avg>=7) {
            return "Khá";
        }
        else if (avg>=5){
            return "Trung bình";
        }
        else{
            return "Yếu";
        }
    }

    public static void main(String[] args) {
        String review=getReview(new int[]{3, 6, 3, 8, 6});
        System.out.println(review);
    }
}