//package com.simplyinvest.docker.dockerspringboot.testdatafromfile;
//
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//
//import java.io.FileReader;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//public class JSONDataFromFile {
//
//
//    public WatchList getWatchList(){
//
//        WatchList watchList = new WatchList();
//        JSONParser parser = new JSONParser();
//
//        try {
//
//            //URL url = getClass().getResource("/tickers.json");
//            //Object obj = parser.parse(new FileReader(url.getPath()));
//
//            InputStream inputStream = getClass().getResourceAsStream("/tickers.json");
//            //File file = new File(url.getPath());
//
////			obj = parser.parse(new FileReader(
////                    "C:\\ws_git\\docker-spring-boot\\yahoo_cookie_crumb.json"));
//            Object obj = parser.parse(new InputStreamReader(inputStream));
//
//            JSONObject jsonObject = (JSONObject) obj;
//
//            String source = (String) jsonObject.get("Source");
//            String week = (String) jsonObject.get("Week");
//            String month  = (String) jsonObject.get("month");
//            String  date = (String) jsonObject.get("date");
//
//            JSONArray companyList = (JSONArray) jsonObject.get("Ticker List");
//
////            System.out.println("Source: " + source);
////            System.out.println("Week: " + week);
////            System.out.println("month: " + month);
////            System.out.println("date: " + date);
////            System.out.println("\nCompany List:");
//
//            watchList.setSource(source);
//            watchList.setWeek(week);
//            watchList.setMonth(month);
//            watchList.setDate(date);
//            List<String> list = new ArrayList<>();
//
//            Iterator<String> iterator = companyList.iterator();
//            while (iterator.hasNext()) {
//                //System.out.println(iterator.next());
//                list.add(iterator.next());
//            }
//            watchList.setTickerList(list);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return watchList;
//
//
//    }
//
//
//    public static void main(String[] args) {
//        JSONDataFromFile jsonDataFromFile = new JSONDataFromFile();
//        jsonDataFromFile.getWatchList();
//    }
//}
