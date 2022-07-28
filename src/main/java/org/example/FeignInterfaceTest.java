package org.example;

public class FeignInterfaceTest implements FeignInterface{
    @Override
    public String getStudents() {
        return "服务出现问题，请稍后再试";
    }
}
