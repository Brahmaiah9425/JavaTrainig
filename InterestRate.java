class Rbi
{
	double getInterestRate(double rate) 
	{
		return rate;
	}
}
class Sbi extends Rbi
{
	double getInterestRate(double rate) 
	{
		return rate+0.5;
	}
}
class Union extends Rbi
{
	double getInterestRate(double rate)
	{
		return rate+0.3;
	}
}
class InterestRate {
    public static void main(String[] args) {
        double principle = 10000; 
        double time = 2; 
        double rate = 5.0;
		Rbi rbi = new Rbi();
        Sbi sbi = new Sbi();
        Union union = new Union();
		double rbiInterest = (principle * rbi.getInterestRate(rate) * time) / 100;
        double sbiInterest = (principle * sbi.getInterestRate(rate) * time) / 100;
        double unionInterest = (principle * union.getInterestRate(rate) * time) / 100;
		System.out.println("RBI Interest: " + rbiInterest);
        System.out.println("SBI Interest: " + sbiInterest);
        System.out.println("Union Interest: " + unionInterest);
    }
}
	