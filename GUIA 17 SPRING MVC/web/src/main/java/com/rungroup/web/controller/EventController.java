package com.rungroup.web.controller;


import com.rungroup.web.dto.EventDto;
import com.rungroup.web.models.Event;
import com.rungroup.web.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class EventController {

    private EventService eventService;


    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }




    @GetMapping("/events")
    public String eventList(Model model){
        List<EventDto> events=eventService.findAllEvents();
        model.addAttribute("events",events);
        return "events-list";

    }


    @GetMapping("/events/{eventId}")
    public String viewEvent(@PathVariable("eventId")Long eventId, Model model) {
        EventDto eventDto = eventService.findByEventId(eventId);
        model.addAttribute("event", eventDto);
        return "events-detail";
    }




    @GetMapping("/events/{clubId}/new")
    public String createEventForm(@PathVariable("clubId") Long clubId, Model model){
        Event event = new Event();
        model.addAttribute("clubId", clubId);
        model.addAttribute("event", event);
        return "events-create";
    }

    @PostMapping("/events/{clubId}")
    public String createEvent(@PathVariable("clubId") Long clubId,
                              @ModelAttribute("event") EventDto eventDto, Model model){
    eventService.createEvent(clubId,eventDto);
    return "redirect:/clubs/" + clubId;
    }





    //-----------------UPDATE-------------------
    @GetMapping("/events/{eventId}/edit")
    public String editEventForm(@PathVariable("eventId") Long eventId, Model model) {
        EventDto event = eventService.findByEventId(eventId);
        model.addAttribute("event", event);
        return "events-edit";
    }

    @PostMapping("/events/{eventId}/edit")
    public String updateEvent(@PathVariable("eventId") Long eventId,
                              @Valid @ModelAttribute("event") EventDto event,
                              BindingResult result, Model model) {
        if(result.hasErrors()) {
            model.addAttribute("event", event);
            return "events-edit";
        }

        //make sure you go to the actual club. Then set it to the event
        //LAZY LOADING
        EventDto eventDto = eventService.findByEventId(eventId);
        event.setId(eventId);
        event.setClub(eventDto.getClub());
        eventService.updateEvent(event);
        return "redirect:/events";
    }


    //-----------------DELETE---------------

    @GetMapping("/events/{eventId}/delete")
    public String deleteEvent (@PathVariable("eventId")long eventId){
        eventService.deleteEvent(eventId);
        return "redirect:/events";
    }

}
