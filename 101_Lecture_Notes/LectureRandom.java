class LectureRandom{
    public static void main(String args[]) {
        double x = (Math.random()* 5);
        System.out.println(x);
        double y = (Math.random() * 5 + 15); 
        System.out.println(y);
        double z = (Math.random() * 5743 + 1024); 
        System.out.println(z);
        int f = (int)(Math.random() * (42 - -13) + -13); 
        System.out.println(f);
        int b = (int)((Math.random() * (55 - 30) + 30))
        int l = (int)((Math.random() * (105 - 80) + 80))
        int answer = (int)((Math.random() * (l - b) + b))
        System.out.println(answer);
	}
}
