package in.ashokit.bind;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@XmlRootElement
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student 
{
	private String studentName;
	private Integer studentId;
	private String studentEmail;

}
