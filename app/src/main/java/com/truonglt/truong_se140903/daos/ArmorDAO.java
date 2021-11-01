package com.truonglt.truong_se140903.daos;

import com.truonglt.truong_se140903.dtos.ArmorDTO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class ArmorDAO {
    public List<ArmorDTO> loadFromInternal(FileInputStream fis) throws Exception {
        List<ArmorDTO> listArmor = new ArrayList<>();
        BufferedReader br = null;
        InputStreamReader isr = null;
        try {
            String s = "";
            ArmorDTO dto = null;
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            while ((s = br.readLine()) != null) {

                String[] tmp = s.split("-");
                dto = new ArmorDTO(tmp[0], tmp[1], tmp[2], Integer.parseInt(tmp[3]), tmp[4], Integer.parseInt(tmp[5]));
                listArmor.add(dto);
            }

        } finally {
            try {
                if (br != null)
                    br.close();
                if (isr != null)
                    isr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return listArmor;
    }

    public void saveToInternal(FileOutputStream fos, List<ArmorDTO> listArmor) throws Exception {
        OutputStreamWriter osw = null;
        try {
            osw = new OutputStreamWriter(fos);
            String result = "";
            for (ArmorDTO dto : listArmor
            ) {
                result += dto.toString() + "\n";
            }
            osw.write(result);
            osw.flush();
        } finally {
            try {
                if (osw != null)
                    osw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

}
