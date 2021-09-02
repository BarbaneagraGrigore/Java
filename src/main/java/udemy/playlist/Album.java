package udemy.playlist;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private final String name;
    private final String artist;
    private final SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, List<Song> playList) {
        Song checkedSong = this.songs.findSong(trackNumber);
        if (checkedSong != null) {
            for (Song song : playList) {
                if (song.equals(songs.findSong(trackNumber))) {
                    return false;
                }
            }
            playList.add(checkedSong);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, List<Song> playList) {
        Song checkedSong = this.songs.findSong(title);
        if (checkedSong != null) {
            for (Song song : playList) {
                if (song.equals(songs.findSong(title))) {
                    return false;
                }
            }
            playList.add(songs.findSong(title));
            return true;
        }
        return false;
    }

    private class SongList {
        private final List<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private Song findSong(String title) {
            for (Song song : songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if ((index >= 0) && (index < songs.size())) {
                return songs.get(index);
            }
            return null;
        }
    }
}
// run in main
//private static final List<Album> albums = new ArrayList<>();
//psvm { Album album = new Album("Stumbling", "Drake");
//        album.addSong("Trula", 4.6);
//        album.addSong("Tularaemia", 4.22);
//        album.addSong("Tu si eu", 4.3);
//        album.addSong("Eu si tu", 4.6);
//        album.addSong("Date", 2.6);
//        album.addSong("Balalaika", 3.6);
//        album.addSong("The hipsters", 1.6);
//
//        albums.add(album);
//
//        album = new Album("For those about to rock", "AC/DC");
//        album.addSong("For those about to rock", 5.44);
//        album.addSong("I put finger on you", 2.44);
//        album.addSong("Brush", 3.44);
//        album.addSong("Chika chick", 7.44);
//        album.addSong("Tularaemia", 1.44);
//        album.addSong("Si dai", 0.44);
//
//        albums.add(album);
//
//        List<Song> playList = new ArrayList<>();
//        albums.get(0).addToPlayList("Eu si tu", playList);
//        albums.get(0).addToPlayList(6, playList);
//        albums.get(0).addToPlayList(6, playList);
//
//        albums.get(1).addToPlayList(1, playList);
//        albums.get(1).addToPlayList(2, playList);
//        albums.get(1).addToPlayList(2, playList);
//
//        play(playList);}
//private static void play(List<Song> playList) {
//    Scanner scanner = new Scanner(System.in);
//    boolean quit = false;
//    boolean forward = true;
//    ListIterator<Song> listIterator = playList.listIterator();
//    if (playList.size() == 0) {
//        System.out.println("No song in playlist");
//    } else {
//        System.out.println("Now playing " + listIterator.next().toString());
//        printMenu();
//    }
//
//    while (!quit) {
//        int action = scanner.nextInt();
//        scanner.nextLine();
//
//        switch (action) {
//            case 0:
//                System.out.println("Playlist complete.");
//                quit = true;
//                break;
//            case 1:
//                if (!forward) {
//                    if (listIterator.hasNext()) {
//                        listIterator.next();
//                    }
//                    forward = true;
//                }
//                if (listIterator.hasNext()) {
//                    System.out.println("Now playing " + listIterator.next().toString());
//                } else {
//                    System.out.println("We have reached the end of the playlist");
//                    forward = false;
//                }
//                break;
//            case 2:
//                if (forward) {
//                    if (listIterator.hasPrevious()) {
//                        listIterator.previous();
//                    }
//                    forward = false;
//                }
//                if (listIterator.hasPrevious()) {
//                    System.out.println("Now playing " + listIterator.previous().toString());
//                } else {
//                    System.out.println("We have reached the start of the playlist.");
//                    forward = true;
//                }
//                break;
//            case 3:
//                if (forward) {
//                    if (listIterator.hasPrevious()) {
//                        System.out.println("Now re-playing " + listIterator.previous().toString());
//                        forward = false;
//                    } else {
//                        System.out.println("We are at the start of the list.");
//                    }
//                } else {
//                    if (listIterator.hasNext()) {
//                        System.out.println("Now re-playing " + listIterator.next().toString());
//                        forward = true;
//                    } else {
//                        System.out.println("We are at the bottom of the list.");
//                    }
//                }
//                break;
//            case 4:
//                printList(playList);
//                break;
//            case 5:
//                printMenu();
//                break;
//            case 6:
//                if (playList.size() > 0) {
//                    listIterator.remove();
//                    if (listIterator.hasNext()) {
//                        System.out.println("Now playing " + listIterator.next().toString());
//                    } else if (listIterator.hasPrevious()) {
//                        System.out.println("Now playing " + listIterator.previous().toString());
//                    }
//                }
//                break;
//        }
//    }
//}
//
//    private static void printMenu() {
//        System.out.println("Print list: " +
//                "\n 0 - Playlist complete." +
//                "\n 1 - Play the next song." +
//                "\n 2 - Play the previous song." +
//                "\n 3 - Replay the song." +
//                "\n 4 - See the playlist." +
//                "\n 5 - See the options." +
//                "\n 6 - Delete the song.");
//    }
//
//    private static void printList(List<Song> playList) {
//        System.out.println("=========================");
//        for (Song song : playList) {
//            System.out.println(song);
//        }
//        System.out.println("=========================");
//    }
