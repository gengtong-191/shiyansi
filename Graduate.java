package jiekou;

public class Graduate implements Students,Teachers {
	String name,sex;
	int age;
	double free,pay;
	double ratal;
	public void Teachersgetmoney(double pay) {
		this.pay =pay*12;
        System.out.println("���������Ϊ��" + this.pay);
	}
	public void Teacherssetmoney(double pay) {
		this.pay = pay*12;
        System.out.println("���������Ϊ��" + this.pay);
	}
	public void Studentsgetmoney(double free) {
		this.free = free;
        System.out.println("���ѧ��Ϊ��" + this.free);
	}
	public void Studentssetmoney(double free){
		this.free = free;
        System.out.println("���ѧ��Ϊ��" + this.free);
	}
    public void setGraduate(String name, String sex, int age) {
        this.sex = sex;
        this.age = age;
        this.name = name;
    }
    public void setRatal() {
        this.ratal = this.pay - this.free ;
        if (ratal < 30000) {
            this.ratal = (this.pay - this.free) * 0.03;
            System.out.println("��˰��" + this.ratal);
        } else if (ratal > 30000 && ratal < 120000) {
            this.ratal = ((this.pay - this.free) - 30000) * 0.1 + 30000 * 0.03;
            System.out.println("��˰��" + this.ratal);
        } else if (ratal > 120000 && ratal < 250000) {
            this.ratal = ((this.pay - this.free) - 120000) * 0.2 + 30000 * 0.03 + 120000 * 0.1;
            System.out.println("��˰��" + this.ratal);
        } else if (ratal > 350000) {
            this.ratal = (this.pay - this.free) *0.3;
            System.out.println("��˰��" + this.ratal);
        }
    }
        public String toString () {
            return "����" + name + '\n' + "����" + age + '\n' + "�Ա�" + sex;
        }
    }


