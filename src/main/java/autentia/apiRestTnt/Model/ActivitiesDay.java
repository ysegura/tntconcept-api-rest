package autentia.apiRestTnt.Model;

import java.util.Date;
import java.util.List;

public class ActivitiesDay {
	
	private Date date;
	
	private Integer total_hours;
	
	private List<Activity> activities;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getTotal_hours() {
		return total_hours;
	}

	public void setTotal_hours(Integer total_hours) {
		this.total_hours = total_hours;
	}

	public List<Activity> getActivities() {
		return activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activities == null) ? 0 : activities.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((total_hours == null) ? 0 : total_hours.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof ActivitiesDay))
			return false;
		ActivitiesDay other = (ActivitiesDay) obj;
		if (activities == null) {
			if (other.activities != null)
				return false;
		} else if (!activities.equals(other.activities))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (total_hours == null) {
			if (other.total_hours != null)
				return false;
		} else if (!total_hours.equals(other.total_hours))
			return false;
		return true;
	}
	
	
	
	

}
