
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.http.HttpResponse.PushPromiseHandler;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Collectors;
import com.opencsv.CSVWriter;
import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONTokener;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;





class apicall{


    public static void main(String[] args) throws IOException, InterruptedException, JSONException {

        var url="https://www.balldontlie.io/api/v1/teams";

        //Http request
       var request= HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        var client=HttpClient.newBuilder().build();
        var response=client.send(request, BodyHandlers.ofString());


//converting using String.split() method with whitespace as a delimiter


/*
        System.out.println(response.statusCode());

        System.out.println(response.body());*/
        //var a=response.body().toArray(String[]::new);

       /* CSVWriter writer = new CSVWriter(new FileWriter("/Users/azuga/Documents/wcTest/test.csv"));
            writer.writeAll((List<String[]>) response);*/


        /*PrintWriter pw=new PrintWriter(new File("/Users/azuga/Documents/wcTest/BASKETBALL.json"));
        pw.write(response.body());
        pw.close();*/

        InputStream is = apicall.class.getResourceAsStream("/BASKETBALL.json");
        JSONTokener tokener = new JSONTokener(is);
        JSONArray jsonArray = new JSONArray(tokener);

        try {
            // Convert JSONArray into csv and save to file
            String csv = CDL.toString(jsonArray);
            Files.write(Path.of("/Users/azuga/Documents/wcTest/test.csv"), csv.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }




    }


    }