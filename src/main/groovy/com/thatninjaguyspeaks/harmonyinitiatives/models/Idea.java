package com.thatninjaguyspeaks.harmonyinitiatives.models;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Idea {
    private String title;
    private String description;
    private String problemStatement;
    private String ourStory;
    private long donationsReceived;
    private int successesReceived;
    private int donorCompanies;
    private String coverImageUrl;
    private String[] photoGalleryUrls;
    private String[] youtubeVideoUrls;

}
