package com.surowka.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "smog", type = "data_unit")
@Data
public class SmogData {

    @Id
    private String id;

    private String stationName;
}
