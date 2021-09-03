package artglorin.weirdjava.generic.solution.container;

import java.util.List;

// tag::include[]
interface ReportService {

    String createReport(List<? extends Resource> resources);

}
// end::include[]
