package entity;

public class Phone extends MyMap<String,Integer>{
    public Phone(String key, Integer value) {
        super(key, value);
    }

    public int getPhoneNumber(){
        return getValue();
    }

    @Override
    public String getKey() {
        return super.getKey();
    }

}
