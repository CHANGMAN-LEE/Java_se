/*
	������ ���� ��� ���α׷�
	�׸��� �̸�(name), ����(position), �⺻��(basicPay), ����(extraPay), ����(taxRate), ����(salary)


	����
	200���� ���� 1%
	400���� ���� 0.02
	400���� �ʰ� 0.03

	���� -> �⺻��  ���� - (�⺻��+����) * ����

	set/get ����, calcPay()���� ���

	[������]
	�̸� : ȫ�浿
	���� : ����
	�⺻�� : 2500000
	���� : 1000000

	-> ȫ�浿 ���� 2500000 1000000 0.02 3430000
*/

class EmployeeDTO {
	private String name;
	private String position;
	private int basicPay;
	private int extraPay;
	private double taxRate;
	private int salary;

	public void setData(String n,  String p, int bP, int eP){
		name = n;
		position = p;
		basicPay = bP;
		extraPay = eP;
	}
	public void taxRate(){
		if(basicPay <= 2000000){
			taxRate = 0.01;
		}else if(basicPay <= 4000000){
			taxRate = 0.02;
		}else if(basicPay > 4000000){
			taxRate = 0.03;
		}
	}
	public void salary(){
		salary = (basicPay + extraPay) - (int)((basicPay + extraPay) * taxRate);
	}


	public String getName(){
		return name;
	}
	public String getPosition(){
		return position;
	}
	public int getBasicPay(){
		return basicPay;
	}
	public int getExtraPay(){
		return extraPay;
	}
	public double getTaxRate(){
		return taxRate;
	}
	public int getSalary(){
		return salary;
	}

	
}