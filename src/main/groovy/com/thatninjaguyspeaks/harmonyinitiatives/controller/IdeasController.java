package com.thatninjaguyspeaks.harmonyinitiatives.controller;

import com.thatninjaguyspeaks.harmonyinitiatives.models.Idea;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/com/thatninjaguyspeaks/harmonyinitiatives/ideas")
@Tag(name = "Ideas Controller", description = "Controller for interactions with ideas")
public class IdeasController {

    @GetMapping("/list")
    @Operation(summary = "Get the ideas creating an impact", description = "Retrieves all the ideas that are available")
    @ApiResponse(responseCode = "200", description = "Data retrieved successfully",
            content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Object.class)))
    public ResponseEntity<Object> getIdeas(){
        List<Idea> ideas = new ArrayList<>();
        ideas.add(Idea.builder().title("asda").coverImageUrl("http://").build());
        return ResponseEntity.ok(ideas);
    }

    @GetMapping("/featured")
    @Operation(summary = "Get the featured idea", description = "Retrieves the idea which has to be featured")
    @ApiResponse(responseCode = "200", description = "Data retrieved successfully",
            content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Object.class)))
    public ResponseEntity<Object> getFeaturedIdea(){
        Idea ideas = Idea.builder().title("asda").coverImageUrl("http://").build();
        return ResponseEntity.ok(ideas);
    }

}
