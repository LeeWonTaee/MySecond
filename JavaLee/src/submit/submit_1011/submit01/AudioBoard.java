package submit.submit_1011.submit01;

public class AudioBoard extends Board{
	private String audioFile;
	
	public AudioBoard(int no, String title, String date, String content, String audioFile) {
		super(no, title, date, content);
		this.audioFile = audioFile;
	}
	
	@Override
	public String toString() {
		return "["+ super.getNo() + ". |" + super.getTitle() + " | " + super.getDate() + "]";
	}

	public String getAudioFile() {
		return audioFile;
	}

	public void setAudioFile(String audioFile) {
		this.audioFile = audioFile;
	}

	
}
