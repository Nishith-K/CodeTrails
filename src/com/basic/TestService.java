package com.basic;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestService {
    public static void main(String args[]){
        List<TestDTO> testDTOList = new ArrayList<>();
        TestDTO testDTO1 = new TestDTO();
        testDTO1.setAmount(Double.valueOf(1000));
        testDTO1.setChitgrpId(1);
        testDTO1.setInstNum(1);
        testDTO1.setSubId(1L);
        testDTO1.setId(1L);
        testDTO1.setForemanId(33L);
        testDTOList.add(testDTO1);

        TestDTO testDTO2 = new TestDTO();
        testDTO2.setAmount(Double.valueOf(2000));
        testDTO2.setChitgrpId(1);
        testDTO2.setInstNum(1);
        testDTO2.setId(2L);
        testDTO2.setForemanId(33L);
        testDTO2.setSubId(1L);
        testDTOList.add(testDTO2);

        TestDTO testDTO3 = new TestDTO();
        testDTO3.setAmount(Double.valueOf(1000));
        testDTO3.setChitgrpId(2);
        testDTO3.setInstNum(2);
        testDTO3.setSubId(2L);
        testDTO3.setId(3L);
        testDTO3.setForemanId(33L);
        testDTOList.add(testDTO3);

        TestDTO testDTO4 = new TestDTO();
        testDTO4.setAmount(Double.valueOf(2000));
        testDTO4.setChitgrpId(2);
        testDTO4.setInstNum(2);
        testDTO4.setSubId(2L);
        testDTO4.setId(4L);
        testDTO4.setForemanId(33L);
        testDTOList.add(testDTO4);

        TestDTO testDTO5 = new TestDTO();
        testDTO5.setAmount(Double.valueOf(5000));
        testDTO5.setChitgrpId(5);
        testDTO5.setInstNum(5);
        testDTO5.setSubId(5L);
        testDTO5.setId(5L);
        testDTO5.setForemanId(33L);
        testDTOList.add(testDTO5);

        System.out.println(testDTOList.size());
        Map<Integer, List<TestDTO>> map = testDTOList.stream().collect(Collectors.groupingBy(TestDTO::getChitgrpId));
        System.out.println(map.size());
        Map<Integer, List<TestDTO>> agentByChgrpId = new HashMap<>();
        List<TestDTO> grpList = new ArrayList<>();
        int i=0;

        for (Map.Entry<Integer, List<TestDTO>> listEntry : map.entrySet()) {
                agentByChgrpId.put(listEntry.getKey(), map.get(listEntry.getKey()));
        }



        agentByChgrpId.forEach((k,v)->{
            System.out.println(k);
            System.out.println(v);
        });

        Collection<TestDTO> doubleListMap = testDTOList.stream().collect(
                Collectors.toMap(
                        f-> f.getChitgrpId() + f.getSubId()+f.getInstNum(),
                        Function.identity(),
                        (s,a) -> new TestDTO(
                                s.getSubId(),
                                s.getAmount() + a.getAmount(),
                                s.getChitgrpId(),
                                s.getInstNum()))
                        ).values();
        System.out.println("Print aggrgtd amt:");
        doubleListMap.forEach(e-> System.out.println(e));
    }

}
