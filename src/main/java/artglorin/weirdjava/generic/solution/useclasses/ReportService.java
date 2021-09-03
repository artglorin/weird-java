package artglorin.weirdjava.generic.solution.useclasses;

import java.util.ArrayList;

// tag::include[]
public interface ReportService {

    String createReport(ArrayList<? extends Resource> resources);

}
// end::include[]
