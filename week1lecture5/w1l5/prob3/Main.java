package w1l5.prob3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UpwardHat uHat = new UpwardHat();
		DownwardHat dHat = new DownwardHat();
		FaceMaker fMaker = new FaceMaker();
		Vertical vertical = new Vertical();
		
		Figure[] figures = {uHat, dHat, fMaker, vertical};
		
		for(Figure figure : figures) {
			System.out.print(figure.getClass() + " :");
			 figure.getFigure();
		}

	}

}
