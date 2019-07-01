package Java_Basics;

public class lineSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a1=5;
	int b1=9;
	int a2=-10;
	int b2=3;

		        Line firstLine = new Line(a1, b1);
		        Line secondLine = new Line(a2, b2);

		        int totalSumOfLines = getTotalSumOfLines(firstLine, secondLine);
		        System.out.println(totalSumOfLines);


		    }

		    private static int getTotalSumOfLines(Line firstLine, Line secondLine) {
				return 0;
		        
		         // Complete this method
		       
		    }

		    public static class Line {
		        private int a;
		        private int b;

		        public Line(int a, int b) {
		            this.a = a;
		            this.b = b;
		        }

		        public int getA() {
		            return a;
		        }

		        public int getB() {
		            return b;
		        }
		    }
	




}