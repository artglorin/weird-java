package artglorin.weirdjava.generic.solution.useclasses;


import java.net.URI;
import java.util.ArrayList;
import java.util.List;

class CreateReportExample {

    private final ResourceFactory factory = new ResourceFactoryImpl();
    private final ReportService reportService = new ReportServiceImpl();

    public void example() {
        // tag::example[]
        String report = reportService.createReport(
                new ArrayList<>(
                        List.of(
                                factory.createResource(
                                        URI.create("file:/share/doc.txt")
                                )
                        )
                )
        );
        // end::example[]
    }

    public static void main(String[] args) {
        new CreateReportExample().example();
    }

}
