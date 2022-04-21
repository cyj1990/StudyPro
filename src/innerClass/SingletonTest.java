package innerClass;

/**
 * ����ʽ
 * �̲߳���ȫ
 * @author yanjiang.chen
 */
class Singleton {
	private static final Singleton singleton = new Singleton();
    private Singleton() {
    }
    public static Singleton getSingleton() {
        return singleton;
    }
}

/**
 * ����ʽ
 * �̰߳�ȫ��Ч�ʽϵ�
 * @author yanjiang.chen
 */
class Singleton2 {
	private   static Singleton2 singleton = null;
    private Singleton2() {
    }
    public synchronized static Singleton2 getSingleton() {
    	if(null == singleton){
    		singleton = new Singleton2();
    	}
        return singleton ;
    }
}

/**
 * ����ʽ
 * �̰߳�ȫ��Ч�ʽϸ�
 * ˫�ؼ����
 * @author yanjiang.chen
 */
class Singleton3 {
	private static Singleton3 singleton = null;
	private Singleton3() {
	}
	public static Singleton3 getSingleton() {
		if (null == singleton) {
			synchronized (Singleton3.class) {
				if (null == singleton) {
					singleton = new Singleton3();
				}
			}
		}
		return singleton;
	}
}


public class SingletonTest {
	public static void main(String[] args) {
//    	Singleton s = new Singleton();
		Singleton s1 = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();
		if (s1 == s2) {
			System.out.println("����");
		} else {
			System.out.println("�ǵ���");
		}
		
		Singleton2 s3 = Singleton2.getSingleton();
		Singleton2 s4 = Singleton2.getSingleton();
		if (s3 == s4) {
			System.out.println("����");
		} else {
			System.out.println("�ǵ���");
		}
		
		Singleton3 s5 = Singleton3.getSingleton();
		Singleton3 s6 = Singleton3.getSingleton();
		if (s5 == s6) {
			System.out.println("����");
		} else {
			System.out.println("�ǵ���");
		}
	}
}