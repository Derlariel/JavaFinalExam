package Interface.Smartphone;

public interface IPhone {
    void call(String PhoneNumber);
    void hangup();
    void sendSms(String PhoneNumber, String Message);

}
