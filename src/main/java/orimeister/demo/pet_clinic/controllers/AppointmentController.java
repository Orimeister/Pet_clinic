package orimeister.demo.pet_clinic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import orimeister.demo.pet_clinic.entities.Appointment;
import orimeister.demo.pet_clinic.services.AppointmentService;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;
    @GetMapping("/by-pet/{petId}")
    public ResponseEntity<List<Appointment>> getAppointmentsByPetId(@PathVariable Integer petId) {
        List<Appointment> appointments = appointmentService.findByPetId(petId);
        return ResponseEntity.ok(appointments);
    }

    @GetMapping("/by-doctor/{doctorId}")
    public ResponseEntity<List<Appointment>> getAppointmentsByDoctorId(@PathVariable Integer doctorId) {
        List<Appointment> appointments = appointmentService.findByDoctorId(doctorId);
        return ResponseEntity.ok(appointments);
    }

    @GetMapping("/by-date")
    public ResponseEntity<List<Appointment>> getAppointmentsByDate(@RequestParam("date") LocalDateTime date) {
        List<Appointment> appointments = appointmentService.findByDate(date);
        return ResponseEntity.ok(appointments);
    }

    @GetMapping("/by-fee")
    public ResponseEntity<List<Appointment>> getAppointmentsByConsultationFee(@RequestParam("fee") BigDecimal fee) {
        List<Appointment> appointments = appointmentService.findByConsultationFee(fee);
        return ResponseEntity.ok(appointments);
    }

    @GetMapping("/by-cancellation-paid")
    public ResponseEntity<List<Appointment>> getAppointmentsByCancellationFeePaid(@RequestParam("paid") Boolean paid) {
        List<Appointment> appointments = appointmentService.findByCancellationFeePaid(paid);
        return ResponseEntity.ok(appointments);
    }

    @GetMapping("/by-status")
    public ResponseEntity<List<Appointment>> getAppointmentsByStatus(@RequestParam("status") String status) {
        List<Appointment> appointments = appointmentService.findByAppointmentStatus(status);
        return ResponseEntity.ok(appointments);
    }
    @PostMapping
    public ResponseEntity<Appointment> createAppointment(@RequestBody Appointment appointment ){
        appointmentService.addAppointment(appointment);
        return new ResponseEntity<>(appointment, HttpStatus.CREATED);
    }
    @PutMapping("/{appointmentId}")
    public ResponseEntity<Appointment> updateAppointment(@RequestBody Appointment appointmentDetails) {

        appointmentService.updateAppointment(appointmentDetails);
        return ResponseEntity.ok(appointmentDetails);
    }
    @DeleteMapping("/{appointmentId}")
    public ResponseEntity<Void> deleteAppointment(@PathVariable Integer appointmentId) {
        appointmentService.deleteAppointment(appointmentId);
        return ResponseEntity.noContent().build();
    }


}
