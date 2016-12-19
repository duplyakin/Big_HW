package proxycasheimpl.dataimpl;

import proxycasheimpl.data.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceImpl implements Service {
    @Override
    public List<String> run(String item, double value, Date date) {
        int iValue = (int) value;
        ArrayList<String> result = new ArrayList<>(iValue);
        for(int i = 0; i<iValue;i++){
            result.add(item+(value - i)+date);
        }
        return result;
    }

    @Override
    public List<String> work(String item) {
        int iValue = item.length();
        ArrayList<String> result = new ArrayList<>(iValue);
        for(int i = 0; i<iValue;i++){
            result.add(item.substring(i));
        }
        return result;

    }
}
