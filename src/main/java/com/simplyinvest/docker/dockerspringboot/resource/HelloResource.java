package com.simplyinvest.docker.dockerspringboot.resource;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/")
public class HelloResource {

//    @RequestMapping("/api/hi")
//    public String hi() {
//        return "Hello World from Restful API";
//    }

    @GetMapping
    public String hello() {
        return "Welcome to clausen.tech";
    }

//    @RequestMapping("/")
//    public String helloWorld() {
//        return "Welcome to clausen.tech";
//    }

//    @GetMapping("/safezone")
//    public List<SafeZoneSignalValue> getSafeZoneUp() {
//
//        List<SafeZoneSignalValue> safeZoneSignal = new ArrayList<>();
//
//        List<LoopBackData<Stock>> stockDataList = getStockData();
//
//        SafeZoneUp safeZoneUp = new SafeZoneUp();
//
//        stockDataList.stream().forEach(stockData -> {
//
//            SafeZoneValues safeZoneValues = new SafeZoneValues(stockData, safeZoneUp.getSafeZoneUp(stockData));
//
//            List<SafeZoneValues.SafeZoneValue> safeZoneValues1 = safeZoneValues.getSafeZone();
//
//            SafeZoneSignalValue safeZoneSignalValue = new SafeZoneSignalValue();
//
//            String ticker = safeZoneValues1.get(0).getStock().getTicker();
//            Double safeAzoneValue = safeZoneValues1.get(safeZoneValues1.size()-1).getSafeZoneValue();
//            Double stockValueAtClose = safeZoneValues1.get(safeZoneValues1.size()-1).getStock().getClose();
//            boolean alert = (safeAzoneValue > stockValueAtClose) ? true : false;
//
//            safeZoneSignalValue.setTicker(ticker);
//            safeZoneSignalValue.setSafeZoneSignalValue(safeAzoneValue);
//            safeZoneSignalValue.setStockValueAtClose(stockValueAtClose);
//            safeZoneSignalValue.setAlert(alert);
//            safeZoneSignal.add(safeZoneSignalValue);
//
//        });
//
//        Stock stock = new Stock();
//
//        stock.setDate(LocalDate.of(2018, 2, 3));
//        stock.setClose(1233);
//
//        Double safeZonePointValue = new Double(1220);
//
//        LoopBackData loopBack = new LoopBackData();
//        ArrayList<Double> safeZoneValuesLst = new ArrayList<>();
//        loopBack.add(stock);
//        safeZoneValuesLst.add(safeZonePointValue);
//
//        //SafeZoneValues safeZoneValues = new SafeZoneValues(loopBack, safeZoneValuesLst);
//
//        //safeZoneValues.getSafeZone();
//
//        return safeZoneSignal;
//
//    }
//
//
//    ArrayList<YahooStockData> yahooData;
//
//    //@GetMapping("/stockdata")
//    public List<LoopBackData<Stock>> getStockData() {
//
//        List<LoopBackData<Stock>> stockDataList = new ArrayList<>();
//
//        JSONDataFromFile watchlist = new JSONDataFromFile();
//
//        List<String> tickerList = watchlist.getWatchList().getTickerList();
//        YahooDataDriver yahooDriver = new YahooDataDriver();
//
//        Date date = new Date();
//        LocalDate now = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//
//        tickerList.stream().forEach(ticker -> {
//
//            yahooData = yahooDriver.getData(ticker, now.minusMonths(1), now);
//
//            for(int i=0; i!= yahooData.size();i++)
//            {
//                System.out.println(yahooData.get(i));
//            }
//
//            LoopBackData<Stock> stocks = new LoopBackData<>();
//
//            yahooData.stream().forEach(y -> {
//
//                Stock stock = new Stock();
//
//                stock.setTicker(y.getStockName());
//                stock.setDate(y.getDate());
//                stock.setOpen(Double.parseDouble(y.getOpen()));
//                stock.setHigh(Double.parseDouble(y.getHigh()));
//                stock.setLow(Double.parseDouble(y.getLow()));
//                stock.setClose(Double.parseDouble(y.getClose()));
//                stock.setVolume(Double.parseDouble(y.getVolume()));
//
//                stocks.add(stock);
//                });
//
//                stockDataList.add(stocks);
//        });
//
//        return stockDataList;
//    }

    @Scheduled(cron="*/5 * * * * MON-FRI")
    public void doSomething() {
        // something that should execute on weekdays only
    }
}
